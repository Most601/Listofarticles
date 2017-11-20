package com.example.most601.listofarticles;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ArticleFregment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ArticleFregment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ArticleFregment extends Fragment {

    private static final String ARG_POSE = "position";

    private int ncurrentpositio ;

    public static ArticleFregment newInstance ( int currentpositio){
        ArticleFregment freq = new ArticleFregment ();
        Bundle args = new Bundle();
        args.putInt(ARG_POSE ,currentpositio );
        freq.setArguments(args);
        return freq;


    }

    public ArticleFregment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ArticleFregment.
     */
    // TODO: Rename and change types and number of parameters
    public static ArticleFregment newInstance(String param1, String param2) {
        ArticleFregment fragment = new ArticleFregment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            ncurrentpositio = args.getInt(ARG_POSE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.article_view, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
    @Override
    public void onSaveInstanceState( Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt(ARG_POSE , ncurrentpositio );
    }

    public void onStart( ){
        super.onStart();
        update(ncurrentpositio);
    }

    private void update(int ncurrentpositio) {
        if(( ncurrentpositio >= 0) && (ncurrentpositio < Data.ARTICLES.length )){
            TextView article = getActivity().findViewById(R.id.article);
            article.setText(Data.ARTICLES[ncurrentpositio]);
            this.ncurrentpositio = ncurrentpositio;


        }
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

package edu.gatech.seclass.sdpcryptogram;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wc on 05/07/2017.
 */

public class PlayerRatingsAdapter extends RecyclerView.Adapter<PlayerRatingsAdapter.PlayerHolder> {

    private ArrayList<Player> mPlayers;


    public static class PlayerHolder extends RecyclerView.ViewHolder {

        private TextView ranking;
        private TextView playername;
        private TextView solvedNum;
        private Player mPlayer;

        private static final String PLAYER_RATING_KEY = "PLAYER_RATING";

        public PlayerHolder(View v) {
            super(v);

            ranking = (TextView) v.findViewById(R.id.player_ranking_num);
            playername = (TextView) v.findViewById(R.id.player_ranking_name);
            solvedNum = (TextView) v.findViewById(R.id.player_ranking_solved);
        }

        public void bindPlayer(Player player) {
            mPlayer = player;
//            mItemDate.setText(photo.getHumanDate());
//            mItemDescription.setText(photo.getExplanation());
        }
    }

    public PlayerRatingsAdapter(ArrayList<Player> players) {
        mPlayers = players;
    }

    @Override
    public PlayerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.player_rating_recycler_item, parent, false);
        return new PlayerHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(PlayerHolder holder, int position) {
        Player player = mPlayers.get(position);
        holder.bindPlayer(player);
    }

    @Override
    public int getItemCount() {
        return mPlayers.size();
    }
}

package com.example.guest.mymessages.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.guest.mymessages.R;
import com.example.guest.mymessages.models.User;

import java.util.ArrayList;

    public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {
        private ArrayList<User> mUsers = new ArrayList<>();
        private Context mContext;

        public UserListAdapter(Context context, ArrayList<User> users) {
            mContext = context;
            mUsers = users;
        }

        @Override
        public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_item, parent, false);
            UserViewHolder viewHolder = new UserViewHolder(view, mUsers);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(UserViewHolder holder, int position) {
            holder.bindUser(mUsers.get(position));
        }

        @Override
        public int getItemCount() {
            return mUsers.size();
        }
    }

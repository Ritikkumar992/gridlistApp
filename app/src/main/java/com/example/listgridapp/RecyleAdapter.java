package com.example.listgridapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyleAdapter extends RecyclerView.Adapter<RecyleAdapter.UserViewHolder> {
    private final List<User> userList;
    private final Context context;
    public RecyleAdapter(List<User> userList, Context context){
        this.userList = userList;
        this.context = context;
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.new_user_list_item,parent,false);
        return new UserViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.imageView.setImageResource(user.getUserImg());
        holder.nameView.setText(user.getName());
    }
    @Override
    public int getItemCount() {
        return userList.size();
    }
    static class UserViewHolder extends RecyclerView.ViewHolder{
        private final TextView nameView;
        private final ImageView imageView;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.nameViewId);
            imageView = itemView.findViewById(R.id.userImgView);
        }
    }
}

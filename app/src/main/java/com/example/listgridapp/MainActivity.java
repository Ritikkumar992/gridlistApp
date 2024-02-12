package com.example.listgridapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<User> userList = new ArrayList<>();

    //using recycler view;
    private RecyclerView recyclerView;
    Button listView, gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recylerViewId);
        listView = findViewById(R.id.listViewId);
        gridView = findViewById(R.id.gridViewId);

        // sample user list.
        userList.add(new User(R.drawable.user_01,"Ritik kumar"));
        userList.add(new User(R.drawable.user_02,"Priyanshu Sharma"));
        userList.add(new User(R.drawable.user_03,"Prince Shah"));
        userList.add(new User(R.drawable.user_04,"Rahul Maity"));
        userList.add(new User(R.drawable.user_05,"Ashutosh Rai"));
        userList.add(new User(R.drawable.user_06,"Shubham Raj"));
        userList.add(new User(R.drawable.user_07,"Paramita Datta"));
        userList.add(new User(R.drawable.user_08, "RajPal Singh Zala"));
        userList.add(new User(R.drawable.user_09,"Akshay Raj"));
        userList.add(new User(R.drawable.user_10, "Sunny Kumar"));
        userList.add(new User(R.drawable.user_11,"Shishir Jha"));
        userList.add(new User(R.drawable.user_12,"Aditya Raj"));
        userList.add(new User(R.drawable.user_13,"Sourav Biswas"));
        userList.add(new User(R.drawable.user_14,"Atanu Panja"));
        userList.add(new User(R.drawable.user_15,"Jaymin Valaki"));
        userList.add(new User(R.drawable.user_16,"Het Patel"));

        // main logic:
        RecyleAdapter recycleAdapter =  new RecyleAdapter(userList, this);
        recyclerView.setAdapter(recycleAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        listView.setOnClickListener(view->{
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        });
        gridView.setOnClickListener(view ->{
            recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        });


    }
}

package sg.edu.np.mad.week2practical;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();

        user.name = "Hello World!";
        user.followed = false;
        user.description = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

        TextView name = findViewById(R.id.name);
        TextView description = findViewById(R.id.description);

        name.setText(user.name);
        description.setText(user.description);

        Button buttonFollow = findViewById(R.id.button_follow);
        buttonFollow.setOnClickListener(view -> {
            if (!user.followed) {
                buttonFollow.setText("UNFOLLOW");
            } else {
                buttonFollow.setText("FOLLOW");
            }

            user.followed = !user.followed;
        });
    }
}
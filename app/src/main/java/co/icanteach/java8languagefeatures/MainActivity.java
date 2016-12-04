package co.icanteach.java8languagefeatures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MainActivity extends AppCompatActivity implements Mathematica {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_submit);

        button.setOnClickListener(view -> submitProduct());


        List<String> list =
                Arrays.asList("a1", "a2", "a3", "b1", "c2", "c1");

        list.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(s -> Log.v("TEST", s));

        Log.v("TEST", "result : " + multiply(3, 4));
        Log.v("TEST", "result : " + add(3, 4));


        Platform platform = new Platform();

        platform.setName("Android");
        platform.setNumberOfTester(1234);

        Optional<Platform> platformOptional = Optional.of(platform);

        platformOptional.ifPresent(platform1 -> Log.v("TEST", platform1.getName()));
    }

    private void submitProduct() {

    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return 0;
    }
}
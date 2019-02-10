package home.stanislavpoliakov.meet17_practice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import home.stanislavpoliakov.meet17_practice.data.database.DatabaseGateway;
import home.stanislavpoliakov.meet17_practice.data.network.NetworkGateway;
import home.stanislavpoliakov.meet17_practice.domain.UseCaseInteractor;
import home.stanislavpoliakov.meet17_practice.presentation.ViewContract;
import home.stanislavpoliakov.meet17_practice.presentation.presenter.Presenter;
import home.stanislavpoliakov.meet17_practice.presentation.view.ViewActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "meet15_logs";
    private Map<String, String> cities = new HashMap<>();
    private ViewContract mActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_activity);

        execute(cities.keySet());
    }

    private void execute(Set<String> cityList) {
        cities.put("Москва", "55.7522200, 37.6155600");
        cities.put("Владивосток", "43.1056200, 131.8735300");
        cities.put("Бангкок", "13.7539800, 100.5014400");
        cities.put("Бали", "22.6485900, 88.3411500");
        cities.put("Дубай", "25.0657000, 55.1712800");
        cities.put("Санта-Крус-де-Тенерифе", "28.4682400, -16.2546200");
        cities.put("Нью-Йорк", "40.7142700, -74.0059700");


        Handler uiHandler = new Handler(msg -> {
            mActivity = (ViewContract) msg.obj;

            continueInit(mActivity);
            return true;
        });

        Intent intent = ViewActivity.newIntent(this, uiHandler);
        intent.putStringArrayListExtra("cities", new ArrayList<>(cityList));
        startActivity(intent);
    }

    private void continueInit(ViewContract mActivity) {
        Presenter presenter = null;
        UseCaseInteractor interactor = null;
        NetworkGateway networkGateway = null;
        DatabaseGateway databaseGateway = null;

       // mActivity.bindImplementations(presenter, interactor, networkGateway, databaseGateway);
    }
}

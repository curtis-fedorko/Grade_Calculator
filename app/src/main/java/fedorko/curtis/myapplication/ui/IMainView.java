package fedorko.curtis.myapplication.ui;


import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;

import java.util.List;

public interface IMainView {
    View getRootView();
    void displayFragment(Fragment f);
    void displayFragment(Class<? extends Fragment> fragmentClass, Bundle args);


    interface Listener {
        void onHome();
        public void getChoice(String choice);

    }

}
package priceless.com.appdolojista;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private PageAdapter pageAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        startViewPager();

    }

    private void startViewPager (){

        SaleFragment saleFragment = new SaleFragment();
        ScoreFragment scoreFragment = new ScoreFragment();
        RedeemFragment redeemFragment = new RedeemFragment();

        pageAdapter = new PageAdapter(this, getSupportFragmentManager(),
                saleFragment, scoreFragment, redeemFragment);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(pageAdapter);
        viewPager.setOffscreenPageLimit(3);

        tabLayout = (TabLayout) findViewById(R.id.tab_lyt);
        tabLayout.setupWithViewPager(viewPager);
        TabLayout.Tab tab = tabLayout.getTabAt(0);
        tab.select();
    }
}

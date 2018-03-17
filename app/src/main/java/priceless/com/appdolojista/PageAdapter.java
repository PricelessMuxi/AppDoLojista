package priceless.com.appdolojista;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by kelly on 17/03/18.
 */

public class PageAdapter extends FragmentPagerAdapter{
    private final int NUM_ITEMS = 3;
    private SaleFragment saleFragment;
    private ScoreFragment scoreFragment;
    private RedeemFragment redeemFragment;
    private CharSequence saleTitle;
    private CharSequence scoreTitle;
    private CharSequence redeemTitle;

    public PageAdapter(Context context, FragmentManager fragmentManager, SaleFragment saleFragment,
                       ScoreFragment scoreFragment, RedeemFragment redeemFragment) {

        super(fragmentManager);
        this.saleFragment = saleFragment;
        this.scoreFragment = scoreFragment;
        this.redeemFragment = redeemFragment;
        this.saleTitle = context.getText(R.string.sale_page_title);
        this.scoreTitle = context.getText(R.string.score_page_title);
        this.redeemTitle = context.getText(R.string.redeem_page_title);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return saleFragment;
            case 1:
                return scoreFragment;
            case 2:
                return redeemFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return saleTitle;
            case 1:
                return scoreTitle;
            case 2:
                return redeemTitle;
            default:
                return null;
        }
    }
}

package com.yat3s.library.sample;

import android.content.Context;

import com.yat3s.library.adapter.BaseAdapter;
import com.yat3s.library.adapter.BaseViewHolder;

/**
 * Created by Yat3s on 6/14/16.
 * Email: hawkoyates@gmail.com
 * GitHub: https://github.com/yat3s
 */

public class CarAdapter extends BaseAdapter<CarModel> {
    public CarAdapter(Context context) {
        super(context);
    }

    @Override
    protected void bindDataToItemView(BaseViewHolder holder, CarModel data, int position) {
        holder.setText(R.id.name_tv, data.name)
                .setText(R.id.price_tv, String.valueOf(data.price));
    }

    @Override
    protected int getItemViewLayoutId(int position, CarModel carModel) {
        if (carModel.price / 1000 == 3) {
            return R.layout.item_car;
        }
        return R.layout.item_house;
    }
}

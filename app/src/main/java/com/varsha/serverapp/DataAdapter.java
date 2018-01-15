package com.varsha.serverapp;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<AndroidVersion> android;

    public DataAdapter(ArrayList<AndroidVersion> android) {
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_name.setText(android.get(i).getName());
        viewHolder.tv_number.setText(android.get(i).getPhoneNumber());
        viewHolder.tv_location.setText(android.get(i).getLocation());
        viewHolder.ordercans.setText("Order Cans:: " + android.get(i).getOrderCans());
        viewHolder.emptycans.setText("Empty Cans:: " + android.get(i).getEmptyCans());
        viewHolder.report.setText("Payment:: " + android.get(i).getPayment() + "-" + android.get(i).getDeliveryReport());
        viewHolder.report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Hai varsha", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name, tv_number, tv_location, ordercans, emptycans;
        private Button report;

        public ViewHolder(View view) {
            super(view);

            tv_name = (TextView) view.findViewById(R.id.tv_name);
            tv_number = (TextView) view.findViewById(R.id.tv_number);
            tv_location = (TextView) view.findViewById(R.id.tv_location);
            ordercans = (TextView) view.findViewById(R.id.ordercans);
            emptycans = (TextView) view.findViewById(R.id.emptycans);
            report = (Button) view.findViewById(R.id.report);

        }
    }

}
package com.example.listview;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends ListActivity {
	String[] presidents = {"1890: " + "Dwight D. Eisenhower", "1895: " + "John F. Kennedy", "Lyndon B. Johnson", "Richard Nixon", "Gerald Ford", "Jimmy Carter", 
			"Ronald Reagan", "George H. W. Bush", "Bill Clinton", "George W. Bush", "Barack Obama"};
	
	/** Called when the activity is first created. */
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.main);*/
        
        ListView lstView = getListView();
        lstView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lstView.setTextFilterEnabled(true);
        
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, presidents));
    }
	
	public void onListItemClick(ListView parent, View v, int position, long id) {
		Toast.makeText(this, "You have selected " + presidents[position], Toast.LENGTH_SHORT).show();
	}
}
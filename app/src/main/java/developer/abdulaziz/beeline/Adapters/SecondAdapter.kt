package developer.abdulaziz.beeline.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import developer.abdulaziz.beeline.Models.MyBeeline
import developer.abdulaziz.beeline.R
import kotlinx.android.synthetic.main.item_second.view.*

class SecondAdapter(context: Context, var list: ArrayList<MyBeeline>, var onClicked: MyClick) :
    ArrayAdapter<MyBeeline>(context, R.layout.item_second, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView: View
        if (convertView == null) {
            itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.item_second, parent, false)
        } else {
            itemView = convertView
        }

        itemView.second_item_name.text = list[position].name
        itemView.second_item_code.text = list[position].code
        itemView.item_click.setOnClickListener {
            onClicked.onClick(list, position)
        }

        return itemView
    }
}

interface MyClick {
    fun onClick(item: ArrayList<MyBeeline>, position: Int)
}
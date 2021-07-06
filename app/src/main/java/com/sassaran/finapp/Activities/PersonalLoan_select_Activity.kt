package com.sassaran.finapp.Activities

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sassaran.finapp.R
import com.sassaran.finapp.base.BaseActivity
import com.sassaran.finapp.databinding.ActivityPersonalloanSelectBinding

class PersonalLoan_select_Activity : BaseActivity<ActivityPersonalloanSelectBinding>(),
    View.OnClickListener {

    override fun layoutRes(): Int {
        return R.layout.activity_personalloan_select
    }

    override fun initialise() {

       binding.personalloanLl.setOnClickListener(this)
        binding.homeloanLl.setOnClickListener(this)
        binding.vehfinLl.setOnClickListener(this)
        binding.paydayLl.setOnClickListener(this)
        binding.creditLl.setOnClickListener(this)
        binding.debitLl.setOnClickListener(this)
        binding.merchcreditLl.setOnClickListener(this)



    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.personalloan_ll -> {
                changeActivity(this,AmtEntry_Activity::class.java,false);
            }
        }
    }
}
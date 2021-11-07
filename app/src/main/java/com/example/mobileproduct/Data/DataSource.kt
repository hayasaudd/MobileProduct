package com.example.mobileproduct.Data

import com.example.mobileproduct.R
import com.example.mobileproduct.model.mobile

//package com.example.product_recycleview.data


class DataSource {
    fun LoadProduct(): List<mobile>{
        return listOf(
            mobile(R.drawable.iphone,"Iphone 12 64GB", "4500 SR", true, 5),
            mobile(R.drawable.samsung_galaxy_z_flip,"Samsung Galaxy S21 Ultra","4500 SR",false,5),
            mobile(R.drawable.xiaomi_pro," Xiaomi 11T Pro","2000 SR",true,0),
            mobile(R.drawable.huawei_yp,"Huawei Y6p","500",false,0),
            mobile(R.drawable.samsung_galaxy_z_flip,"Samsung Galaxy Z Flip3","5000 SR",true,70),
            mobile(R.drawable.iphone13,"Iphone 13","6000 SR",true,36),
        )
    }
}
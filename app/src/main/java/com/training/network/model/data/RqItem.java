package com.training.network.model.data;

import com.training.network.model.RequestObject;

/**
 * Created by chenqiuyi on 16/12/8.
 */

public class RqItem extends RequestObject {
    public RqItem() {
        super("/v2.0/project/probably_info_all/get");
    }
}

package com.linqibin.bo;

import java.io.Serializable;

public class ProductInfoBo implements Serializable {
    private Long productId;

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }
}

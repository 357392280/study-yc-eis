
package com.du.study.entity.vo;


public class SkuList {

    private String itemcode;
    private String lotno;
    private int qty;
    private String stockunit;
    private String palletno;
    public void setItemcode(String itemcode) {
         this.itemcode = itemcode;
     }
     public String getItemcode() {
         return itemcode;
     }

    public void setLotno(String lotno) {
         this.lotno = lotno;
     }
     public String getLotno() {
         return lotno;
     }

    public void setQty(int qty) {
         this.qty = qty;
     }
     public int getQty() {
         return qty;
     }

    public void setStockunit(String stockunit) {
         this.stockunit = stockunit;
     }
     public String getStockunit() {
         return stockunit;
     }

    public void setPalletno(String palletno) {
         this.palletno = palletno;
     }
     public String getPalletno() {
         return palletno;
     }

}
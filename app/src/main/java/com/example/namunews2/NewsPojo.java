package com.example.namunews2;

public class NewsPojo {
    private NewsDTO[] itemList;

    public NewsDTO[] getItemList ()
    {
        return itemList;
    }

    public void setItemList (NewsDTO[] itemList)
    {
        this.itemList = itemList;
    }
}

package week03;

import java.util.ArrayList;

public class GroceryList {  //blueprint for all my shopping lists

    private ArrayList<String> groceryList;

    public GroceryList(){
        groceryList = new ArrayList<>();
    }

    public void addGroceryList(String item){
        groceryList.add(item);
    }

    public String toString() {
        String list="You have "+groceryList.size()+" items in your grocery list";
        for (int i = 0; i < groceryList.size(); i++) {
            list+="\n"+(i+1)+"."+ groceryList.get(i);
        }
        return list;
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1)+" has been modified");
    }

    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        String searchResult = "Not Found";
        int position = groceryList.indexOf(searchItem);
        if(position>=0){
            searchResult = searchItem+ " item found at line " +(position+1);
        }
        return searchResult;
    }
}
/*
1. Create a custom class called GroceryList
        Instance Variable
        - we have only one attribute: an Arraylist named 'groceryList'
        Instance Methods:
        - addGroceryItem(String item)
        - printGroceryList
        - modify
        - remove
        - findItem
 */
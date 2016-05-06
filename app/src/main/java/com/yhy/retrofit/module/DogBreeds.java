package com.yhy.retrofit.module;



import com.yhy.retrofit.DogBreed;
import com.yhy.retrofit.GroupBreeds;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/2/24.
 */
public class DogBreeds {
    ArrayList<DogBreed> hotBreeds;
    GroupBreeds groupBreeds;

    public ArrayList<DogBreed> getHotBreeds() {
        return hotBreeds;
    }

    public void setHotBreeds(ArrayList<DogBreed> hotBreeds) {
        this.hotBreeds = hotBreeds;
    }

    public GroupBreeds getGroupBreeds() {
        return groupBreeds;
    }

    public void setGroupBreeds(GroupBreeds groupBreeds) {
        this.groupBreeds = groupBreeds;
    }
}

package com.firminapp.myokhttprequestmaker.callbacks;


import com.firminapp.myokhttprequestmaker.MyOkhttpRequestMaker;

/**
 * Created by firmin on 03/02/18.
 */

public interface OncacheListener {
    void onCache(boolean serverStatut, MyOkhttpRequestMaker requestMaker);
}

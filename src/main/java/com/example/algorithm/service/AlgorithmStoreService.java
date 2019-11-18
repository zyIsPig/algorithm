package com.example.algorithm.service;

import com.example.algorithm.domain.Algorithm.Algorithm;
import com.example.algorithm.domain.AlgorithmStore;

public interface AlgorithmStoreService {

    /**
     * 新增一个算法
     *
     */
    public void publishAlgorithm(AlgorithmStore algorithmStore, Algorithm algorithm);

    /**
     * 下架一个算法
     *

     */
    public void deleteAlgorithm(AlgorithmStore algorithmStore,Algorithm algorithm);

    /**
     * 更新已上架算法属性
     *
     */
    public void updateAlgorithm(AlgorithmStore algorithmStore,Algorithm algorithm);


}

package com.ceyhan.kriptoparatakip.service

import com.ceyhan.kriptoparatakip.model.CryptoModel
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface CryptoAPI {
    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json
    @GET ("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData() : Observable<List<CryptoModel>>
}
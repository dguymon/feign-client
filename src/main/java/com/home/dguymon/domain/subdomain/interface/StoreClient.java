package com.home.dguymon.domain.subdomain.interface;

@FeignClient("stores")
public interface StoreClient {
  
  @RequestMapping(method = RequestMethod.GET, value = "/stores")
  List<Store> getStores();
  
  @RequestMapping(method = RequestMethod.POST, value = "/stores/{storeId}", consumes = "application/json")
  Store update(@PathVariable("storeId") Long storeId, Store store);
}
package com.zurazu.zurazu_backend.core.service;

import com.zurazu.zurazu_backend.core.enumtype.SaleStatusType;
import com.zurazu.zurazu_backend.provider.dto.PurchaseProductDTO;
import com.zurazu.zurazu_backend.web.dto.RequestPurchaseDTO;
import com.zurazu.zurazu_backend.web.dto.SelectAllPurchaseLimitDTO;

import java.util.List;
import java.util.Optional;

public interface PurchaseInfoServiceInterface {
    void purchaseProduct(RequestPurchaseDTO requestPurchaseDTO);
    Optional<List<PurchaseProductDTO>> selectAllPurchaseHistory(SelectAllPurchaseLimitDTO selectAllPurchaseLimitDTO);
    Optional<List<PurchaseProductDTO>> selectAllPurchaseHistoryByType(SelectAllPurchaseLimitDTO selectAllPurchaseLimitDTO);
    Optional<List<PurchaseProductDTO>> selectAllMemberPurchaseHistory(SelectAllPurchaseLimitDTO selectAllPurchaseLimitDTO);
    void confirmPurchase(int memberIdx, String orderNumber);
}

package com.backbase.presentation.transaction.service;

import static com.backbase.presentation.transaction.Endpoints.DIRECT_MX_CATEGORY_ENRICH;
import static com.backbase.presentation.transaction.util.RequestUtil.copyRequestList;

import com.backbase.buildingblocks.backend.internalrequest.InternalRequest;
import com.backbase.buildingblocks.presentation.errors.BadRequestException;
import com.backbase.presentation.transaction.model.MxTransaction;
import com.backbase.presentation.transaction.model.MxTransactions;

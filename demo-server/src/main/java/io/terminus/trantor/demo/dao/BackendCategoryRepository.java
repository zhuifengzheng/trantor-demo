package io.terminus.trantor.demo.dao;

import io.terminus.trantor.demo.model.BackendCategory;
import io.terminus.trantor.sdk.autumn.dao.TrantorDAO;
import org.springframework.stereotype.Repository;

@Repository
public class BackendCategoryRepository extends TrantorDAO<BackendCategory, Long> {
}
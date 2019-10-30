package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.seoul.app.zeropay_client.DataBinderMapperImpl());
  }
}

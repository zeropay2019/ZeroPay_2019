package com.seoul.app.zeropay_client.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.adapter.InfoListAdapter
import com.seoul.app.zeropay_client.model.Info
import kotlinx.android.synthetic.main.fragment_info.*

class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val detailInfoFragment = InfoDetailFragment()
        val infoAdapter = InfoListAdapter({
            val bundle = Bundle()
            bundle.putSerializable("info",it)
            detailInfoFragment.arguments = bundle
            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.container_frame, detailInfoFragment)
                .addToBackStack(null)
                .commit()
        }, makeInfoData())
        info_recyclerView.adapter = infoAdapter
        info_recyclerView.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun makeInfoData(): ArrayList<Info>{
        val list = ArrayList<Info>()
        list.add(Info("제로페이모바일상품권 법인대량구매 안내","test"))
        list.add(Info("[온누리모바일상품권] 제로페이 앱에서 10% 할인된 가격으로 사고!쓰고! 선물하세요!","[온누리모바일상품권] 제로페이 앱에서 10% 할인된 가격으로 사고!쓰고!선물하세요!\n" +
                "\n" +
                " ▶ 기     간 : 2019.9.4.~\n" +
                " ▶ 할 인 율 : 10%(~2천억 원 소진시까지)\n" +
                "                    소진 후에는 6% 할인(~'19.12월 말까지)\n" +
                "                    ※ 발행액(3천억 원) 소진 시 할인이 조기 종료될 수 있습니다.\n" +
                " ▶ 발행권종 : 5천원, 1만원, 5만원, 10만원\n" +
                " ▶ 구매한도 : 월 50만원\n" +
                " ▶ 사  용 처 : 온누리상품권 가맹점이면서 제로페이가맹점\n" +
                " ▶ 온누리상품권 이용 가능 앱\n" +
                "      ; 올원뱅크(NH농협), 투유뱅크개인(경남은행), 광주은행개인뱅킹,  아이M뱅크(대구은행),\n" +
                "        썸뱅크(부산은행), 전북은행뉴스마트뱅킹, 착한페이(KT), 체크페이(쿠콘)\n" +
                " ▶ 문 의 처 : 중소기업통합콜센터(1357)\n"))
        list.add(Info("[양식] 온누리 및 지역사랑 모바일상품권[제로페이] 가맹신청서","안녕하세요\n" +
                "소상공인간편결제추진사업단입니다.\n" +
                "\n" +
                "온누리 및 지역사랑 모바일상품권 가맹모집 안내를 아래와 같이 안내하오니, 많은 관심 부탁드립니다.\n" +
                "\n" +
                " 가. 가맹신청\n" +
                "       [가맹대상]\n" +
                "       전통시장 및 상점가, 상권활성화구역 내 사업자등록증을 가진 상인\n" +
                "        * 단, 사업자등록증번호가 없는 노점과 등록제한 업종(도박, 사행성 등은) 가맹불가\n" +
                "  \n" +
                "      [제로페이 가맹점]\n" +
                "      제출서류 : 1)  [붙임 1]온누리 및 지역사랑 모바일상품권 결제·이용 동의서\n" +
                "                                         (펌뱅킹 출금이체 동의서 포함)\n" +
                "\n" +
                "      비      고 : 결제·이용 동의 시 제로페이QR를 통해 모바일상품권 결제 가능\n" +
                "                      모바일상품권 가맹스티커 배부 예정\n" +
                "                      결제취소를 위한 펌뱅킹 출금이체 동의 필요\n" +
                "\n" +
                "      [제로페이 미가맹점]\n" +
                "      제출서류 : 1) [붙임 2] 온누리 및 지역사랑 모바일상품권(제로페이) 가맹신청서[붙임2]\n" +
                "                                       (펌뱅킹 출금이체 동의서 포함)\n" +
                "                      2) 사업자등록증, 신분증 사본\n" +
                "\n" +
                "      비      고 : 가맹신청 시 제로페이 결제 가능\n" +
                "                      ‘모바일상품권·제로페이’ QR키트 및 스티커 등 발송(1~2주 소요)\n" +
                "                      결제취소를 위한 펌뱅킹 출금이체 동의 필요\n" +
                "\n" +
                "  * 온누리상품권 미가맹점은 온누리상품권(지류 또는 전자)가맹 후 모바일상품권 가맹 가능\n" +
                "\n" +
                " 나. 제출방법 : 가맹신청서 우편발송\n" +
                "                       34940 대전광역시 중구 중앙로 76 영민빌딩 3층 소상공인간편결제추진사업단 \n" +
                "\n" +
                " 다. 문  의 처 : 제로페이 콜센터(1670-0582)\n"))
        list.add(Info("대리인 위임장 서식 (법인사업자용)","우리 소상공인 간편결제추진사업단은 제로페이 가맹점의 서비스 확대를 위해 붙임과 같이 가맹점 표준약관을 개정하고자 합니다. \n" +
                "\n" +
                "1.적용예정일 : 2019. 9. 10\n" +
                "2.주요개정내용 \n" +
                "  - 모바일 온누리 상품권 및 지역화폐 이용 서비스 확대\n" +
                "  - 참여기관 및 가맹점 업무편의 \n" +
                "\n" +
                "자세한 내용은 붙임의 파일을 참고하시기 바랍니다. \n" +
                "\n" +
                "감사합니다.\n"))
        list.add(Info("일반 법인 및 프랜차이즈 가맹 본사 관련 안내","안녕하세요. 제로페이 입니다. \n" +
                "\n" +
                "법인 사업자 및 프랜차이즈 가맹 본사 차원에서 가입 하시는 경우에 필요한 양식 첨부드립니다.\n" +
                "감사합니다. \n" +
                "\n" +
                "* 금융기관코드 파일을 추가하였습니다. 신청서 작성 시 참고하시길 바랍니다."))
        list.add(Info("(중요!) 제로페이 현금영수증 발행 관련 안내","제로페이 현금영수증 처리와 관련하여 안내 말씀드립니다. \n" +
                "2019년부터 제로페이 결제분은 현금영수증 발행 대상이 아닙니다. \n" +
                "\n" +
                "2019년 발급된 내역이 있으시면 발급취소 하셔야 합니다. \n" +
                "2019년부터는 전자영수증 발급으로 국세청으로 자동전송되며\n" +
                "\n" +
                "가맹점에서 현금영수증 발행 시, 중복 되오니 참고하여 주시기 바랍니다. \n" +
                "\n" +
                "궁금하신점 고객센터 1670-0582로 문의주시기 바랍니다. \n" +
                "감사합니다.\n"))
        list.add(Info("(중요!) 제로페이 결제 스미싱 주의","안녕하세요\n" +
                "소상공인간편결제추진단입니다.\n" +
                "최근 제로페이 결제 스미싱 문자 및 전화가 다시 발생하고 있어 관련 주의사항을 안내드립니다.\n" +
                "\n" +
                "[전화]\n" +
                "1. 상품권 100만원을 제로페이 결제하면,  수수료를 제외한 나머지 금액을 입금해달라고 하는 전화의 경우\n" +
                "    보이스피싱 혹은 카드깡 의심사례 입니다. \n" +
                "\n" +
                "[문자]\n" +
                "1.  제로페이 웹발신 승인번호 5896\n" +
                "      10만원 결제됩니다. 2월합산청구금액 40만원 \n" +
                "      문의전화: 02-1811-8038\n" +
                "\n" +
                "2. 장수돌침대 주문\n" +
                "    주문번호(281255751717532) 주문이 완료되었습니다.  \n" +
                "    문자발신번호: 070-7678-6091\n" +
                "\n" +
                "3. 문화상품권 94만원 승인완료,\n" +
                "    문자발신번호: 1811-8038\n" +
                "\n" +
                "4. \"제로페이 금일 940,000원 결제완료 주문번호 xxx\n" +
                "    승인번호xxx, 문의전화 : 053-217-2901\"\n" +
                "    문자발신번호 : 053-217-2671\n" +
                "\n" +
                "5. 제로pay \n" +
                "    모바일 인증번호[54840]\n" +
                "    입력시 결제완료\n" +
                "    468,000원 익월청구\n" +
                "    [우리 파이낸셜]\n" +
                "   -문자발신번호 : 02-6405-0212\n" +
                "\n" +
                "6.  (웹발신)\n" +
                "     제로pay 인증번호 00\n" +
                "     4385 575.000원\n" +
                "     승인완료\n" +
                "     요청일시 2019/05/15\n" +
                "    (웹발신)\n" +
                "    인증번호: 4358\n" +
                "    제로페이 575,000원 승인완료\n" +
                "    문자발신번호 : 02-6080-2052\n" +
                "                           02-6080-2152\n" +
                "\n" +
                "7. 문자발신번호 : 070-7663-9407\n" +
                "                           070-8892-3799\n" +
                "\n" +
                "위와 같은 유형으로 수신된 문자 메시지는 제로페이 결제와 전혀 무관한\n" +
                "신종 금융범죄로 문자메시지 내 문의전화를 클릭하지 마시고,\n" +
                "수신된 문자를 삭제하시기 바랍니다.\n" +
                "\n" +
                "\n" +
                "스미싱 문자로 피해를 입으신 분께서는\n" +
                "182 경찰민원 콜센터로 문의 하시고,  신고 절차를 진행하시기 바랍니다. \n" +
                "\n" +
                "문의사항은 제로페이 고객센터 1670-0582로 연락주십시요\n" +
                "감사합니다.\n\n"))
        list.add(Info("제로페이 가맹점 전용앱 이용가이드(201908)","제로페이 가맹점 전용앱 이용가이드를 업데이트하여 게시합니다(2019.8월).\n" +
                "\n" +
                "가맹점 전용앱 이용에 활용하시기 바랍니다. \n" +
                "\n" +
                "* 제로페이 가맹점 전용앱은 제로페이를 이용하시는 가맹점에서 사용하는 것으로\n" +
                "   일반 소비자가 설치할 필요가 없습니다."))
        list.add(Info("제로페이 가맹점홈페이지 이용가이드","제로페이 가맹점홈페이지 이용가이드를 게시합니다. (2019년 3월 수정)\n" +
                "\n" +
                "홈페이지 이용에 활용하시기 바랍니다.\n" +
                "\n" +
                "*제로페이를 이용하시려는 가맹점에서는 제로페이 홈페이지에 회원가입하시기 바랍니다.\n" +
                "  제로페이를 이용하시는 소비자는 회원가입할 필요가 없습니다."))

        return list
    }

}

drop table apart;
drop table interest;
create table apart (
    area_name varchar2(40),
    area_size varchar2(60),
    year_date varchar2(10),
    month_date number(2),
    price_per_m_2 number(5)
);

create table interest (
    bank varchar2(60),
    category varchar2(60),
    rate number(5,2)
);

한국 부동산 자료 -> Data Access Object (csv를 java로 읽고 DB에 저장 -> sql로 검색 -> java)
아파트 DTO (지역, 규모구분, 분양가격)

<최종 ? 시간이 가능하다면>
내가 입력하는 것은
(내 월급, 저축률, [살고자하는 아파트 DTO (지역, 규모) -> 분양가격] )

결과값
: 내가 살고자하는 아파트에 살려면 n개월 남았습니다.

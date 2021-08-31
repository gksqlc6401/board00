package org.zerock.board00.common.converter;

import lombok.extern.log4j.Log4j2;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
@Log4j2
public class StringToLocalDateTimeConverter implements Converter<String, LocalDateTime> {//문자열을 로컬데이트타임타입으로 바꿔주는 클래스
                                     //면접질문: 파라미터값을 받는데 이거 커스터마이징 해봤니? 그럼 어떻게 했지?
    @Override
    public LocalDateTime convert(String source) {//입력한 소스 파라미터값으로 받아오는거

        log.info("------------------------------");
        log.info("convert: " + source);//출력

        Pattern pattern =  Pattern.compile("^((19|20)\\d\\d)?([- /.])?(0[1-9]|1[012])([- /.])?(0[1-9]|[12][0-9]|3[01])$");//정규 표현식
                                                                      // ex)이메일@ .
        Matcher matcher = pattern.matcher(source);//정규 표현식이랑 내가 입력한 값이랑 맞는지 확인하는 과정

        if(matcher.find()){//막약 맞다면
            return LocalDateTime.parse(
                    source+"T00:00:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME);//입력한 값으로 돌려주는것
        }
        return LocalDateTime.now();//아니면 현재시간 출력
    }
}
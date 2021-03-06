'''
문자열 (string)

-단일 문자들을 따옴표로(''  ,  "") 로 감싸서 
나열한 문자 데이터의 집합 형태입니다.
따옴표 안에 어떤 형태의 데이터가 들어가도 문자로 인식

-전세계의 모든 문자를 저장할 수 있고 , 길이에 제한 없음 
'''
#나는 그에게 "도와줘!" 라고 말했다.
# 탈출 문자를 적용해서 (\) 따옴표를 문자로 표현할 수 있다.
s1='나는 그에게 "도와줘!" 라고 말했다.'
s11="나는 그에게 \"도와줘!\"라고 말했다."
s111="나는 그에게 '도와줘!' 라고 말했다."


#Let's go together!
s2='Let\'s go together!'

file1='C:\\temp\\new.jpg'
print(file1)


#문자열 앞에 r이라는 접두어를 붙이면
#해당 문자열을 탈출 문자를 적용하지 않는다.
file2=r'C:\temp\new.jpg'
print(file2)

#파이썬은 문장주석이라는 개념이 존재하지 않기 때문에 , '''  '''를 문장주석의 개념으로 사용함
# 줄 개행이 포함되어있는 문자열을  생성할 때에는 """   """를 사용하는게 관례
anthem="""동해물과 백두산이 마르고 닳도록 
하느님이 보우하사 우리나라만세
무궁화 삼천리 화려강산 
대한사람 대한으로 길이 보전하세"""

print(anthem)

#\를 문장 끝에 붙여주면 line continue  :한줄에 다 나옴 (문장 개행 없음)
anthem2="""동해물과 백두산이 마르고 닳도록 \ 
하느님이 보우하사 우리나라만세 \
무궁화 삼천리 화려강산  \
대한사람 대한으로 길이 보전하세"""
print(anthem2)

'''
문자열 연산

파이썬은 문자열의 덧셈 , 곱셈 연산을 지원
-덧셈 연산은 문자열을 서로 연결하여 결합
'''
s3='오늘 저녁은 '
s4='치킨입니다.'
print(s3+s4+'와 맛있겠다~!')

'''
파이썬은 문자열의 곱셉 연산 지원
-곱셉 연사자(*)로 문자열을 정해진 수 만큼 반복해서 연결
'''
print('배고파'*4)
print('-'*30)

#print(s3*1.7) XXX 횟수를 정해주는것이기 때문에 실수는 안되고 정수만 가능 
#print(s3*s4)  XXX 문자열 끼리 곱할수 없다.
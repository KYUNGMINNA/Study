
'''
*표준 입력함수 input()

-함수 괄호 안에 사용자에게 질문할 내용을 문자열 형태로 
작성합니다.

-input()과 함꼐 항상 변수를 선언해서 입력값을 받아주셔야 하며
입력받은 데이터 타입은 str로 저장됩니다.
input의 리턴은 무조건 str
'''

nick=input('너 별명이 뭐야?:')
print('내 별명은'+nick+'입니다')

#입력값이 정수 ,실수라면 
#input 함수 자체를 int() , float() 로 감싸 주면 된다.
#input 함수의 리턴값이 문자열이라고 했으니까, 변환해서 대입하면 끝 .
price=int(input('음식의 가격 :'))
people=int(input('사람의 수:'))
print('지불할 가격:',price*people,'원')
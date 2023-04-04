# 자바 웹 개발 워크북

![image](https://user-images.githubusercontent.com/111167712/229546984-be3b41db-2d44-4970-9a25-62fb0c8ad0af.png)


## READ.ME - 내가 모르는 것만 정리 할 예정

- 아는 내용이 많을 것이므로 한번 더 복습한다는 생각으로 보기
- 내가 모르는 부분을 집중적으로 공부


## CH 1 웹 프로그래밍의 시작

### 코드 반영 (deploy) 

![K-051](https://user-images.githubusercontent.com/111167712/229547384-77367ed7-3453-46cb-bf28-13f48c0bfef6.png)


- On 'Update' action : update classes and resources
- On 'frame dactivation : update classes and resources

2개 옵셕 수정하면 JSP는 자동으로 변경 코드 반영함

![K-052](https://user-images.githubusercontent.com/111167712/229547399-70dc8ab3-11f4-4560-bfe6-d567dcffe0f1.png)


자바 Class, Servlet은 Redeploy 버튼 누르면 변경 코드 반영

### PRG 패턴 (Post-Redirect-Get)

POST 요청이 중복해서 발생하는 경우를 막기 위한 방법

- 사용자가 원하는 작업을 컨트롤러에 POST 방식으로 요청
- POST 방식 요청을 컨트롤러에서 처리하고 브라우저는 다른 경로로 이동(GET 방식) 하라는 응답(Redirect)
- 브라우저는 GET방식으로 이동

![image](https://user-images.githubusercontent.com/111167712/229545634-72e63e06-e617-4624-9b63-6a4c7239122a.png)

## CH 2 웹과 데이터베이스

### ModelMapper 사용

- DTO - VO 사이의 변환에서 주로 사용
- 이전에는 DTO, VO 둘 다 사용하는 것은 코드가 많고 변환하는 과정이 번거로웠으나 이번에 둘 다 사용하는 합리적인 방법을 알게됨

### Enum을 통한 싱글턴

- Enum에 Instance 하나 만을 만들어서 싱글턴으로 만드는 방식은 자바에서 추천하는 싱글턴 사용 방식임
- 최근 디자인 패턴 공부에서 알게 되었으나 실제로 써보는 것은 처음

```java
public enum TodoService {
    INSTANCE;
    
    ...
    
}
```

```java
public class TodoListController extends HttpServlet {

    private TodoService todoService = TodoService.INSTANCE;
    
    ...
    
}
```






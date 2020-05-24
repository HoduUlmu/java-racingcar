## 구현 기능 목록

* 모든 로직에 단위 테스트를 구현한다.
    * UI(System.in, System.out) 로직은 제외함.
* 게임을 실행하는 별도의 클래스에서 System.in, System.out을 처리.
    * 기존은 RacingGame 내부에서 System.in과 System.out을 처리함.
* 안내를 통해 사용자의 입력값을 저장하는 UI.
* 입력값이 잘못된 경우 예외 처리.
* 입력값(자동차 대수 등)을 토대로 자동차 객체 생성.
* 입력값(시도 회수)만큼 게임을 진행.
* 난수 생성.
* 자동차 객체의 Position을 이동시키기는 기능.
* 경기 결과를 출력하는 기능.
* 가장 멀리 주행한 자동차들의 리스트를 가져오고 출력하는 기능.

## MVC 기반 리팩토링

* Domain
    * Car
    * CarFactory
    * CarGroups
    * RacingGame
    * MovingStrategy
    * RandomMovingStrategy
    * Message
 
 * Controller
    * RacingGameController
    
 * View
    * InputView
    * ResultView
  
  * Application
    * Main
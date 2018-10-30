package com.aracon.beginner.ai

object BasicDecisionMaking {

  // First example, Pong. Approaches like this are often termed “reactive” because there are a simple set of rules – in this case, ‘if’ statements in the code – which react to the current state of the world and immediately make a decision on how to act.
  final case class Position(x: Int, y: Int)
  final case class Ball(position: Position)
  final case class Paddle(position: Position)

  sealed trait Movement
  object Right extends Movement
  object Left extends Movement
  object None extends Movement

  // pong is uni-dimensional on paddle movement, we ignore Paddle y location
  def pongPaddle(currentBall: Ball, currentPaddle: Paddle): Movement = {
    // if the ball is to the left of the paddle:
    if(currentBall.position.x < currentPaddle.position.x) Left
    // else if the ball is to the right of the paddle:
    else if(currentBall.position.x > currentPaddle.position.x) Right
    else None
  }

}


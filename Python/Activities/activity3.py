#Take both player's input
while True:
    player1_input=input("Please enter rock, paper, or scissors: ").lower()
    player2_input=input("Please enter rock, paper, or scissors: ").lower()

    #check for win condition
    if player1_input==player2_input:
        print("Tie")
    elif player1_input=="rock":
        if player2_input=="scissors":
            print("Player1 wins")
        else:
            print("Player2 wins")
    elif player1_input=="scissors":
        if player2_input=="paper":
            print("player1 wins")
        else:
            print("Player2 wins")
    elif player1_input=="paper":
        if player2_input=="rock":
            print("player1 wins")
        else:
            print("Player2 wins")
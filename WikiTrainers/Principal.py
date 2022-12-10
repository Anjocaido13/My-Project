from tkinter import*
from tkinter import ttk
from PIL import Image, ImageTk
from info import *
#cores
co0 = "#444466"
co1 = "#feffff"
co2 = "#6f9fbd"
co3 = "#38576b"
co4 = "#403d3d"
co5 = "#ef5350"
#criar a janela
janela = Tk()
janela.title("WIKITRAINERS")
janela.geometry('550x510')
janela.configure(bg=co1)

ttk.Separator(janela, orient=HORIZONTAL).grid(row=0, columnspan=1, ipadx=272)

style = ttk.Style(janela)
style.theme_use("clam")

#frame
frame_poke = Frame(janela, width=550, height=290,bg='#2b2b2c', relief='flat')
frame_poke.grid(row=1, column=0)

#função para trocar de pokemon
def troca(i):
    global imagem_principal, img_poke

    #tipo
    name_poke['text'] = i
    name_poke['bg'] = poke[i]['Tipo'][3]
    tipo_poke['text'] = poke[i]['Tipo'][1]
    tipo_poke['bg'] = poke[i]['Tipo'][3]
    num_poke['text'] = poke[i]['Tipo'][0]
    num_poke['bg'] = poke[i]['Tipo'][3]

    #status
    hp['text'] = poke[i]['Status'][0]
    attack['text'] = poke[i]['Status'][1]
    defense['text'] = poke[i]['Status'][2]
    speed['text'] = poke[i]['Status'][3]

    #movimentos
    mov1['text'] = poke[i]['Movimentos'][0]
    mov2['text'] = poke[i]['Movimentos'][1]
    mov3['text'] = poke[i]['Movimentos'][2]
    mov4['text'] = poke[i]['Movimentos'][3]

    #mudar cor de fundo

    frame_poke['bg'] = poke[i]['Tipo'][3]

    imagem_principal = poke[i]['Tipo'][2]


    imagem_principal = Image.open(imagem_principal)
    imagem_principal = imagem_principal.resize((238, 238))
    imagem_principal = ImageTk.PhotoImage(imagem_principal)

    img_poke = Label(frame_poke,image=imagem_principal, relief='flat',bg=poke[i]['Tipo'][3], fg=co0)
    img_poke.place(x=60, y=70)





#nome do poke
name_poke = Label(frame_poke, text='Angelo Santos', relief='flat', anchor=CENTER, font=('Fixedsys 20'),bg='#2b2b2c', fg=co0)
name_poke.place(x=12, y=15)

#tipo
tipo_poke = Label(frame_poke, text='', relief='flat', anchor=CENTER, font=('Fixedsys 10'),bg='#2b2b2c', fg=co0)
tipo_poke.place(x=12, y=50)
#numero do pokedex
num_poke = Label(frame_poke, text='#1313', relief='flat', anchor=CENTER, font=('Fixedsys 10'),bg='#2b2b2c', fg=co0)
num_poke.place(x=12, y=70)

#imagem do pokemon
imagem_principal = Image.open('AngeloIcon.png')
imagem_principal = imagem_principal.resize((238, 238))
imagem_principal = ImageTk.PhotoImage(imagem_principal)

img_poke = Label(frame_poke,image=imagem_principal, relief='flat',bg='#2b2b2c', fg=co0)
img_poke.place(x=60, y=70)

#status
status = Label(janela, text='Info', relief='flat', anchor=CENTER, font=('Fixedsys 20'),bg=co1, fg=co0)
status.place(x=15, y=310)
#vida
hp = Label(janela, text='Money: 31753125381$', relief='flat', anchor=CENTER, font=('Fixedsys 10'),bg=co1, fg=co0)
hp.place(x=15, y=350)

#ATTACK
attack = Label(janela, text='Wins: A lot of', relief='flat', anchor=CENTER, font=('Fixedsys 10'),bg=co1, fg=co0)
attack.place(x=15, y=380)

#Defense
defense = Label(janela, text='Pokemon : Hydreigon', relief='flat', anchor=CENTER, font=('Fixedsys 10'),bg=co1, fg=co0)
defense.place(x=15, y=410)

#Speed
speed = Label(janela, text='Rival: Momoca', relief='flat', anchor=CENTER, font=('Fixedsys 10'),bg=co1, fg=co0)
speed.place(x=15, y=440)

#movs
movs = Label(janela, text='', relief='flat', anchor=CENTER, font=('Fixedsys 20'),bg=co1, fg=co0)
movs.place(x=180, y=310)

#mov
mov1 = Label(janela, text='', relief='flat', anchor=CENTER, font=('Fixedsys 10'),bg=co1, fg=co0)
mov1.place(x=180, y=350)

#mov2
mov2 = Label(janela, text='', relief='flat', anchor=CENTER, font=('Fixedsys 10'),bg=co1, fg=co0)
mov2.place(x=180, y=380)

#mov3
mov3 = Label(janela, text='', relief='flat', anchor=CENTER, font=('Fixedsys 10'),bg=co1, fg=co0)
mov3.place(x=180, y=410)

#mov4
mov4 = Label(janela, text='', relief='flat', anchor=CENTER, font=('Fixedsys 10'),bg=co1, fg=co0)
mov4.place(x=180, y=440)

#menu de pokemons
imagem_pokebola = Image.open('pokebola.png')
imagem_pokebola = imagem_pokebola.resize((40, 40))
imagem_pokebola = ImageTk.PhotoImage(imagem_pokebola)
#button hydreigon
b_hydreigon = Button(janela,command=lambda:troca('Hydreigon'),image=imagem_pokebola, text='Hydreigon', width=150, relief='raised',overrelief=RIDGE,compound=LEFT, anchor=NW,padx=5, font=('Verdana 12'), bg='red', fg=co0)
b_hydreigon.place(x=375, y=30)

#button charizard
b_zard = Button(janela,command=lambda:troca('Charizard'),image=imagem_pokebola, text='Charizard', width=150, relief='raised',overrelief=RIDGE,compound=LEFT, anchor=NW,padx=5, font=('Verdana 12'), bg='red', fg=co0)
b_zard.place(x=375, y=80)

#button kingdra
b_king = Button(janela,command=lambda:troca('Kingdra'),image=imagem_pokebola, text='Kingdra', width=150, relief='raised',overrelief=RIDGE,compound=LEFT, anchor=NW,padx=5, font=('Verdana 12'), bg='red', fg=co0)
b_king.place(x=375, y=130)

#button milotic
b_milotic = Button(janela,command=lambda:troca('Milotic'),image=imagem_pokebola, text='Milotic', width=150, relief='raised',overrelief=RIDGE,compound=LEFT, anchor=NW,padx=5, font=('Verdana 12'), bg='red', fg=co0)
b_milotic.place(x=375, y=180)

#button weaville
b_weaville = Button(janela,command=lambda:troca('Weavile'),image=imagem_pokebola, text='weavile', width=150, relief='raised',overrelief=RIDGE,compound=LEFT, anchor=NW,padx=5, font=('Verdana 12'), bg='red', fg=co0)
b_weaville.place(x=375, y=230)

#button goodra
b_goodra = Button(janela,command=lambda:troca('Goodra'),image=imagem_pokebola, text='Goodra', width=150, relief='raised',overrelief=RIDGE,compound=LEFT, anchor=NW,padx=5, font=('Verdana 12'), bg='red', fg=co0)
b_goodra.place(x=375, y=280)
janela.mainloop()

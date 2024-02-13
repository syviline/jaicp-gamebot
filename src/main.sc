require: slotfilling/slotFilling.sc
  module = sys.zb-common

theme: /

    state: Start
        q!: $regex</start>
        a: Молви друг и войди!
    
        state: Melon
            q: мелон
            a: Входите! Вы в подземелье Мории. Перед вами три прохода.
               Какой выберете?
               
            
            

    state: NoMatch
        event!: noMatch
        a: Попробуйте сказать это на эльфийском
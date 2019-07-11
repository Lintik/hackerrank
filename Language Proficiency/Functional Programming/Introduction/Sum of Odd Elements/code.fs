open System

(*USER CODE BEGIN*)
let f arr = arr |> List.fold (fun s v -> if Math.Abs(v % 2) = 1 then s + v else s) 0
(*USER CODE END*)

let read_and_parse()=
    let mutable arr = []
    let mutable buff = Console.ReadLine()
    while buff <> null do
            arr <- Int32.Parse(buff)::arr
            buff <- Console.ReadLine()
    arr

let main =    
    let arr = read_and_parse()
    printf "%A" <| f arr
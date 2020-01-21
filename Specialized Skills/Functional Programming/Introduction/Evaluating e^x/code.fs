open System
let factorial v =
        let rec fact c p =
                match c with
                | 0.0 -> p
                | _ -> fact <| c - 1.0 <| c * p
        fact v 1.0

let exp (ex:float List, x: float) =
        List.map (fun xx -> 
                        match xx with 
                        | 0. -> 1.
                        | xx -> x ** xx / factorial xx) ex
let n = Int32.Parse(Console.ReadLine())
for i in [1..n] do
        let mutable x = Console.ReadLine() |> float
        exp ([0.0..9.0], x) |> List.sum |> printfn "%f"
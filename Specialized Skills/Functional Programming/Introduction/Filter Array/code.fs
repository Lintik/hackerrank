open System

let x = int(Console.ReadLine())
let i = Console.In.ReadToEnd().Split([|Environment.NewLine|], StringSplitOptions.RemoveEmptyEntries) |> Array.map (fun t-> int t) |> List.ofArray
let rec filter values = 
    match values with 
    | [] -> []
    | head::tail -> if head < x then head::(filter tail) else filter tail


i |> filter |> List.iter (printfn "%d")
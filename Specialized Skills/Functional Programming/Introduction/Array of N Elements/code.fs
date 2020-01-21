open System

let f n = [1..n]

let main() =
    let input = Console.ReadLine()
    let n = int input
    printfn "%A" (f n)

main()
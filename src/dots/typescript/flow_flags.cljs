(ns dots.typescript.flow-flags
  (:require ["typescript" :as typescript]))

(def unreachable (.-Unreachable typescript/FlowFlags))

(def start (.-Start typescript/FlowFlags))

(def branch-label (.-BranchLabel typescript/FlowFlags))

(def loop-label (.-LoopLabel typescript/FlowFlags))

(def assignment (.-Assignment typescript/FlowFlags))

(def true-condition (.-TrueCondition typescript/FlowFlags))

(def false-condition (.-FalseCondition typescript/FlowFlags))

(def switch-clause (.-SwitchClause typescript/FlowFlags))

(def array-mutation (.-ArrayMutation typescript/FlowFlags))

(def call (.-Call typescript/FlowFlags))

(def reduce-label (.-ReduceLabel typescript/FlowFlags))

(def referenced (.-Referenced typescript/FlowFlags))

(def shared (.-Shared typescript/FlowFlags))

(def label (.-Label typescript/FlowFlags))

(def condition (.-Condition typescript/FlowFlags))

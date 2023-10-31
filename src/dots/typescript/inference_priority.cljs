(ns dots.typescript.inference-priority
  (:require ["typescript" :as typescript]))

(def naked-type-variable (.-NakedTypeVariable typescript/InferencePriority))

(def speculative-tuple (.-SpeculativeTuple typescript/InferencePriority))

(def substitute-source (.-SubstituteSource typescript/InferencePriority))

(def homomorphic-mapped-type (.-HomomorphicMappedType typescript/InferencePriority))

(def partial-homomorphic-mapped-type (.-PartialHomomorphicMappedType typescript/InferencePriority))

(def mapped-type-constraint (.-MappedTypeConstraint typescript/InferencePriority))

(def contravariant-conditional (.-ContravariantConditional typescript/InferencePriority))

(def return-type (.-ReturnType typescript/InferencePriority))

(def literal-keyof (.-LiteralKeyof typescript/InferencePriority))

(def no-constraints (.-NoConstraints typescript/InferencePriority))

(def always-strict (.-AlwaysStrict typescript/InferencePriority))

(def max-value (.-MaxValue typescript/InferencePriority))

(def priority-implies-combination (.-PriorityImpliesCombination typescript/InferencePriority))

(def circularity (.-Circularity typescript/InferencePriority))

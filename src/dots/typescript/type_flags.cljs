(ns dots.typescript.type-flags
  (:refer-clojure :exclude [boolean])
  (:require ["typescript" :as typescript]))

(def any (.-Any typescript/TypeFlags))

(def unknown (.-Unknown typescript/TypeFlags))

(def string (.-String typescript/TypeFlags))

(def number (.-Number typescript/TypeFlags))

(def boolean (.-Boolean typescript/TypeFlags))

(def enum (.-Enum typescript/TypeFlags))

(def big-int (.-BigInt typescript/TypeFlags))

(def string-literal (.-StringLiteral typescript/TypeFlags))

(def number-literal (.-NumberLiteral typescript/TypeFlags))

(def boolean-literal (.-BooleanLiteral typescript/TypeFlags))

(def enum-literal (.-EnumLiteral typescript/TypeFlags))

(def big-int-literal (.-BigIntLiteral typescript/TypeFlags))

(def es-symbol (.-ESSymbol typescript/TypeFlags))

(def unique-es-symbol (.-UniqueESSymbol typescript/TypeFlags))

(def void (.-Void typescript/TypeFlags))

(def undefined (.-Undefined typescript/TypeFlags))

(def null (.-Null typescript/TypeFlags))

(def never (.-Never typescript/TypeFlags))

(def type-parameter (.-TypeParameter typescript/TypeFlags))

(def object (.-Object typescript/TypeFlags))

(def union (.-Union typescript/TypeFlags))

(def intersection (.-Intersection typescript/TypeFlags))

(def index (.-Index typescript/TypeFlags))

(def indexed-access (.-IndexedAccess typescript/TypeFlags))

(def conditional (.-Conditional typescript/TypeFlags))

(def substitution (.-Substitution typescript/TypeFlags))

(def non-primitive (.-NonPrimitive typescript/TypeFlags))

(def template-literal (.-TemplateLiteral typescript/TypeFlags))

(def string-mapping (.-StringMapping typescript/TypeFlags))

(def literal (.-Literal typescript/TypeFlags))

(def unit (.-Unit typescript/TypeFlags))

(def freshable (.-Freshable typescript/TypeFlags))

(def string-or-number-literal (.-StringOrNumberLiteral typescript/TypeFlags))

(def possibly-falsy (.-PossiblyFalsy typescript/TypeFlags))

(def string-like (.-StringLike typescript/TypeFlags))

(def number-like (.-NumberLike typescript/TypeFlags))

(def big-int-like (.-BigIntLike typescript/TypeFlags))

(def boolean-like (.-BooleanLike typescript/TypeFlags))

(def enum-like (.-EnumLike typescript/TypeFlags))

(def es-symbol-like (.-ESSymbolLike typescript/TypeFlags))

(def void-like (.-VoidLike typescript/TypeFlags))

(def union-or-intersection (.-UnionOrIntersection typescript/TypeFlags))

(def structured-type (.-StructuredType typescript/TypeFlags))

(def type-variable (.-TypeVariable typescript/TypeFlags))

(def instantiable-non-primitive (.-InstantiableNonPrimitive typescript/TypeFlags))

(def instantiable-primitive (.-InstantiablePrimitive typescript/TypeFlags))

(def instantiable (.-Instantiable typescript/TypeFlags))

(def structured-or-instantiable (.-StructuredOrInstantiable typescript/TypeFlags))

(def narrowable (.-Narrowable typescript/TypeFlags))

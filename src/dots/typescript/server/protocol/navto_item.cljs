(ns dots.typescript.server.protocol.navto-item
  "An item found in a navto response."
  (:refer-clojure :exclude [name]))

(defn name
  "The symbol's name."
  ^js [navto-item]
  (.-name ^js navto-item))

(defn set-name!
  "The symbol's name."
  ^js [navto-item value]
  (set! (.-name ^js navto-item) value))

(defn kind
  "The symbol's kind (such as 'className' or 'parameterName')."
  ^js [navto-item]
  (.-kind ^js navto-item))

(defn set-kind!
  "The symbol's kind (such as 'className' or 'parameterName')."
  ^js [navto-item value]
  (set! (.-kind ^js navto-item) value))

(defn match-kind
  "exact, substring, or prefix."
  ^js [navto-item]
  (.-matchKind ^js navto-item))

(defn set-match-kind!
  "exact, substring, or prefix."
  ^js [navto-item value]
  (set! (.-matchKind ^js navto-item) value))

(defn case-sensitive?
  "If this was a case sensitive or insensitive match."
  ^js [navto-item]
  (.-isCaseSensitive ^js navto-item))

(defn set-is-case-sensitive!
  "If this was a case sensitive or insensitive match."
  ^js [navto-item value]
  (set! (.-isCaseSensitive ^js navto-item) value))

(defn kind-modifiers
  "Optional modifiers for the kind (such as 'public')."
  ^js [navto-item]
  (.-kindModifiers ^js navto-item))

(defn set-kind-modifiers!
  "Optional modifiers for the kind (such as 'public')."
  ^js [navto-item value]
  (set! (.-kindModifiers ^js navto-item) value))

(defn container-name
  "Name of symbol's container symbol (if any); for example,
   the class name if symbol is a class member."
  ^js [navto-item]
  (.-containerName ^js navto-item))

(defn set-container-name!
  "Name of symbol's container symbol (if any); for example,
   the class name if symbol is a class member."
  ^js [navto-item value]
  (set! (.-containerName ^js navto-item) value))

(defn container-kind
  "Kind of symbol's container symbol (if any)."
  ^js [navto-item]
  (.-containerKind ^js navto-item))

(defn set-container-kind!
  "Kind of symbol's container symbol (if any)."
  ^js [navto-item value]
  (set! (.-containerKind ^js navto-item) value))

(defn file
  "File containing text span."
  ^js [navto-item]
  (.-file ^js navto-item))

(defn set-file!
  "File containing text span."
  ^js [navto-item value]
  (set! (.-file ^js navto-item) value))

(defn start
  "First character of the definition."
  ^js [navto-item]
  (.-start ^js navto-item))

(defn set-start!
  "First character of the definition."
  ^js [navto-item value]
  (set! (.-start ^js navto-item) value))

(defn end
  "One character past last character of the definition."
  ^js [navto-item]
  (.-end ^js navto-item))

(defn set-end!
  "One character past last character of the definition."
  ^js [navto-item value]
  (set! (.-end ^js navto-item) value))

(ns dots.typescript.super-call)

(defn expression
  ^js [super-call]
  (.-expression ^js super-call))

(defn kind
  ^js [super-call]
  (.-kind ^js super-call))

(defn question-dot-token
  ^js [super-call]
  (.-questionDotToken ^js super-call))

(defn type-arguments
  ^js [super-call]
  (.-typeArguments ^js super-call))

(defn arguments
  ^js [super-call]
  (.-arguments ^js super-call))

(defn flags
  ^js [super-call]
  (.-flags ^js super-call))

(defn parent
  ^js [super-call]
  (.-parent ^js super-call))

(defn source-file
  ^js [super-call]
  (.getSourceFile ^js super-call))

(defn child-count
  (^js [super-call]
   (.getChildCount ^js super-call))
  (^js [super-call source-file]
   (.getChildCount ^js super-call source-file)))

(defn child-at
  (^js [super-call index]
   (.getChildAt ^js super-call index))
  (^js [super-call index source-file]
   (.getChildAt ^js super-call index source-file)))

(defn children
  (^js [super-call]
   (.getChildren ^js super-call))
  (^js [super-call source-file]
   (.getChildren ^js super-call source-file)))

(defn start
  (^js [super-call]
   (.getStart ^js super-call))
  (^js [super-call source-file]
   (.getStart ^js super-call source-file))
  (^js [super-call source-file include-js-doc-comment?]
   (.getStart ^js super-call source-file include-js-doc-comment?)))

(defn full-start
  ^js [super-call]
  (.getFullStart ^js super-call))

(defn get-end
  ^js [super-call]
  (.getEnd ^js super-call))

(defn width
  (^js [super-call]
   (.getWidth ^js super-call))
  (^js [super-call source-file]
   (.getWidth ^js super-call source-file)))

(defn full-width
  ^js [super-call]
  (.getFullWidth ^js super-call))

(defn leading-trivia-width
  (^js [super-call]
   (.getLeadingTriviaWidth ^js super-call))
  (^js [super-call source-file]
   (.getLeadingTriviaWidth ^js super-call source-file)))

(defn full-text
  (^js [super-call]
   (.getFullText ^js super-call))
  (^js [super-call source-file]
   (.getFullText ^js super-call source-file)))

(defn text
  (^js [super-call]
   (.getText ^js super-call))
  (^js [super-call source-file]
   (.getText ^js super-call source-file)))

(defn first-token
  (^js [super-call]
   (.getFirstToken ^js super-call))
  (^js [super-call source-file]
   (.getFirstToken ^js super-call source-file)))

(defn last-token
  (^js [super-call]
   (.getLastToken ^js super-call))
  (^js [super-call source-file]
   (.getLastToken ^js super-call source-file)))

(defn for-each-child
  (^js [super-call cb-node]
   (.forEachChild ^js super-call cb-node))
  (^js [super-call cb-node cb-node-array]
   (.forEachChild ^js super-call cb-node cb-node-array)))

(defn decorators
  ^js [super-call]
  (.-decorators ^js super-call))

(defn modifiers
  ^js [super-call]
  (.-modifiers ^js super-call))

(defn pos
  ^js [super-call]
  (.-pos ^js super-call))

(defn end
  ^js [super-call]
  (.-end ^js super-call))

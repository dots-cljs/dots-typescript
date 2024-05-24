(ns dots.typescript.core-transformation-context)

(defn factory
  ^js [core-transformation-context]
  (.-factory ^js core-transformation-context))

(defn compiler-options
  "Gets the compiler options supplied to the transformer.
   
   **Returns:** `CompilerOptions`"
  ^js [core-transformation-context]
  (.getCompilerOptions ^js core-transformation-context))

(defn start-lexical-environment
  "Starts a new lexical environment.
   
   **Returns:** `void`"
  ^js [core-transformation-context]
  (.startLexicalEnvironment ^js core-transformation-context))

(defn suspend-lexical-environment
  "Suspends the current lexical environment, usually after visiting a parameter list.
   
   **Returns:** `void`"
  ^js [core-transformation-context]
  (.suspendLexicalEnvironment ^js core-transformation-context))

(defn resume-lexical-environment
  "Resumes a suspended lexical environment, usually before visiting a function body.
   
   **Returns:** `void`"
  ^js [core-transformation-context]
  (.resumeLexicalEnvironment ^js core-transformation-context))

(defn end-lexical-environment
  "Ends a lexical environment, returning any declarations.
   
   **Returns:** `Statement[] | undefined`"
  ^js [core-transformation-context]
  (.endLexicalEnvironment ^js core-transformation-context))

(defn hoist-function-declaration
  "Hoists a function declaration to the containing scope.
   
   **Parameters:**
   - `node`: `FunctionDeclaration`
   
   **Returns:** `void`"
  ^js [core-transformation-context node]
  (.hoistFunctionDeclaration ^js core-transformation-context node))

(defn hoist-variable-declaration
  "Hoists a variable declaration to the containing scope.
   
   **Parameters:**
   - `node`: `Identifier`
   
   **Returns:** `void`"
  ^js [core-transformation-context node]
  (.hoistVariableDeclaration ^js core-transformation-context node))

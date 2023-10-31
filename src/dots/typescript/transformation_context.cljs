(ns dots.typescript.transformation-context)

(defn request-emit-helper
  "Records a request for a non-scoped emit helper in the current context."
  ^js [transformation-context helper]
  (.requestEmitHelper ^js transformation-context helper))

(defn read-emit-helpers
  "Gets and resets the requested non-scoped emit helpers."
  ^js [transformation-context]
  (.readEmitHelpers ^js transformation-context))

(defn enable-substitution
  "Enables expression substitutions in the pretty printer for the provided SyntaxKind."
  ^js [transformation-context kind]
  (.enableSubstitution ^js transformation-context kind))

(defn substitution-enabled?
  "Determines whether expression substitutions are enabled for the provided node."
  ^js [transformation-context node]
  (.isSubstitutionEnabled ^js transformation-context node))

(defn on-substitute-node
  "Hook used by transformers to substitute expressions just before they
   are emitted by the pretty printer.
   
   NOTE: Transformation hooks should only be modified during `Transformer` initialization,
   before returning the `NodeTransformer` callback."
  ^js [transformation-context]
  (.-onSubstituteNode ^js transformation-context))

(defn set-on-substitute-node!
  "Hook used by transformers to substitute expressions just before they
   are emitted by the pretty printer.
   
   NOTE: Transformation hooks should only be modified during `Transformer` initialization,
   before returning the `NodeTransformer` callback."
  ^js [transformation-context value]
  (set! (.-onSubstituteNode ^js transformation-context) value))

(defn enable-emit-notification
  "Enables before/after emit notifications in the pretty printer for the provided
   SyntaxKind."
  ^js [transformation-context kind]
  (.enableEmitNotification ^js transformation-context kind))

(defn emit-notification-enabled?
  "Determines whether before/after emit notifications should be raised in the pretty
   printer when it emits a node."
  ^js [transformation-context node]
  (.isEmitNotificationEnabled ^js transformation-context node))

(defn on-emit-node
  "Hook used to allow transformers to capture state before or after
   the printer emits a node.
   
   NOTE: Transformation hooks should only be modified during `Transformer` initialization,
   before returning the `NodeTransformer` callback."
  ^js [transformation-context]
  (.-onEmitNode ^js transformation-context))

(defn set-on-emit-node!
  "Hook used to allow transformers to capture state before or after
   the printer emits a node.
   
   NOTE: Transformation hooks should only be modified during `Transformer` initialization,
   before returning the `NodeTransformer` callback."
  ^js [transformation-context value]
  (set! (.-onEmitNode ^js transformation-context) value))

(defn factory
  ^js [transformation-context]
  (.-factory ^js transformation-context))

(defn compiler-options
  "Gets the compiler options supplied to the transformer."
  ^js [transformation-context]
  (.getCompilerOptions ^js transformation-context))

(defn start-lexical-environment
  "Starts a new lexical environment."
  ^js [transformation-context]
  (.startLexicalEnvironment ^js transformation-context))

(defn suspend-lexical-environment
  "Suspends the current lexical environment, usually after visiting a parameter list."
  ^js [transformation-context]
  (.suspendLexicalEnvironment ^js transformation-context))

(defn resume-lexical-environment
  "Resumes a suspended lexical environment, usually before visiting a function body."
  ^js [transformation-context]
  (.resumeLexicalEnvironment ^js transformation-context))

(defn end-lexical-environment
  "Ends a lexical environment, returning any declarations."
  ^js [transformation-context]
  (.endLexicalEnvironment ^js transformation-context))

(defn hoist-function-declaration
  "Hoists a function declaration to the containing scope."
  ^js [transformation-context node]
  (.hoistFunctionDeclaration ^js transformation-context node))

(defn hoist-variable-declaration
  "Hoists a variable declaration to the containing scope."
  ^js [transformation-context node]
  (.hoistVariableDeclaration ^js transformation-context node))

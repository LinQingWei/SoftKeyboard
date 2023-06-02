package com.github.softkeyboard.test;

import android.content.Intent;
import android.inputmethodservice.InputMethodService;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodSubtype;

import java.util.Arrays;

public class SoftKeyboardTest extends InputMethodService {
    private static final String TAG = "SoftKeyboardTest";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");
    }

    @Override
    public void onInitializeInterface() {
        super.onInitializeInterface();
        Log.d(TAG, "onInitializeInterface");
    }

    @Override
    public View onCreateInputView() {
        Log.d(TAG, "onCreateInputView");
        return null;
    }

    @Override
    public View onCreateCandidatesView() {
        Log.d(TAG, "onCreateCandidatesView");
        return null;
    }

    @Override
    public void onStartInput(EditorInfo attribute, boolean restarting) {
        super.onStartInput(attribute, restarting);
        Log.d(TAG, "onStartInput(" + attribute + ", " + restarting + ")");
    }

    @Override
    public void onStartInputView(EditorInfo info, boolean restarting) {
        super.onStartInputView(info, restarting);
        Log.d(TAG, "onStartInputView(" + info + ", " + restarting + ")");
    }

    @Override
    public void onStartCandidatesView(EditorInfo info, boolean restarting) {
        super.onStartCandidatesView(info, restarting);
        Log.d(TAG, "onStartCandidatesView(" + info + ", " + restarting + ")");
    }

    @Override
    protected void onCurrentInputMethodSubtypeChanged(InputMethodSubtype newSubtype) {
        super.onCurrentInputMethodSubtypeChanged(newSubtype);
        Log.d(TAG, "onCurrentInputMethodSubtypeChanged: " + newSubtype);
    }

    @Override
    public void onDisplayCompletions(CompletionInfo[] completions) {
        super.onDisplayCompletions(completions);
        Log.d(TAG, "onDisplayCompletions: " + Arrays.toString(completions));
    }

    @Override
    public void onBindInput() {
        super.onBindInput();
        Log.d(TAG, "onBindInput");
    }

    @Override
    public void onFinishInput() {
        super.onFinishInput();
        Log.d(TAG, "onFinishInput");
    }

    @Override
    public void onFinishInputView(boolean finishingInput) {
        super.onFinishInputView(finishingInput);
        Log.d(TAG, "onFinishInputView: " + finishingInput);
    }

    @Override
    public void onFinishCandidatesView(boolean finishingInput) {
        super.onFinishCandidatesView(finishingInput);
        Log.d(TAG, "onFinishCandidatesView: " + finishingInput);
    }

    @Override
    public AbstractInputMethodImpl onCreateInputMethodInterface() {
        AbstractInputMethodImpl inputMethod = super.onCreateInputMethodInterface();
        Log.d(TAG, "onCreateInputMethodInterface: " + inputMethod);
        return inputMethod;
    }

    @Override
    public AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() {
        AbstractInputMethodSessionImpl inputMethodSession = super.onCreateInputMethodSessionInterface();
        Log.d(TAG, "onCreateInputMethodSessionInterface: " + inputMethodSession);
        return inputMethodSession;
    }

    @Override
    public void onConfigureWindow(Window win, boolean isFullscreen, boolean isCandidatesOnly) {
        super.onConfigureWindow(win, isFullscreen, isCandidatesOnly);
        Log.d(TAG, "onConfigureWindow: " + win + ", " + isFullscreen + ", " + isCandidatesOnly);
    }

    @Override
    public void onViewClicked(boolean focusChanged) {
        super.onViewClicked(focusChanged);
        Log.d(TAG, "onViewClicked: " + focusChanged);
    }

    @Override
    public void onWindowHidden() {
        super.onWindowHidden();
        Log.d(TAG, "onWindowHidden");
    }

    @Override
    public void onWindowShown() {
        super.onWindowShown();
        Log.d(TAG, "onWindowShown");
    }

    @Override
    public void updateInputViewShown() {
        super.updateInputViewShown();
        Log.d(TAG, "updateInputViewShown");
    }

    @Override
    public void switchInputMethod(String id) {
        super.switchInputMethod(id);
        Log.d(TAG, "switchInputMethod: " + id);
    }

    @Override
    public void onUnbindInput() {
        super.onUnbindInput();
        Log.d(TAG, "onUnbindInput");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        boolean res = super.onUnbind(intent);
        Log.d(TAG, "onUnbind: " + intent + ", " + res);
        return res;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

}
